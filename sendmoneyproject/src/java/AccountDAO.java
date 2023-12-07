import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
    private static final String SELECT_ACCOUNT_BY_NUMBER = "SELECT * FROM accounts WHERE account_number=?";
    private static final String UPDATE_ACCOUNT_BALANCE = "UPDATE accounts SET balance=? WHERE account_number=?";

    public AccountDTO getAccountByNumber(String accountNumber) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnectin();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_BY_NUMBER)) {

            preparedStatement.setString(1, accountNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new AccountDTO(resultSet.getString("account_number"), resultSet.getDouble("balance"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception after logging
        }

        return null;
    }

    public void updateAccountBalance(AccountDTO account) {
        try (Connection connection = DatabaseConnection.getConnectin();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ACCOUNT_BALANCE)) {

            preparedStatement.setDouble(1, account.getBalance());
            preparedStatement.setString(2, account.getAccountNumber());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
